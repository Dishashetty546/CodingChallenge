const express = require('express');
const router = express.Router();
const fs = require('fs');
const csv = require('csv-parser');
const path = require('path');

const readCSV = (filePath) => {
    const results = [];
    return new Promise((resolve, reject) => {
        fs.createReadStream(filePath)
            .pipe(csv())
            .on('data', (data) => results.push(data))
            .on('end', () => resolve(results))
            .on('error', (error) => reject(error));
    });
};

// Search route
router.get('/', async (req, res) => {
    const query = req.query.q || ''; // Get search query from the URL, default to empty string
    let data = [];

    try {
        const doctorsData = await readCSV(path.join(__dirname, '../data/Doctors_Per_Capital_By_Country.csv'));
        const nursesData = await readCSV(path.join(__dirname, '../data/Nurses_Per_Capital_By_Country.csv'));

        // Combine both datasets based on LOCATION
        data = doctorsData.map(doc => {
            const nurseData = nursesData.find(nurse => nurse.LOCATION === doc.LOCATION) || {};
            return {
                Country: doc.LOCATION,
                Doctors: doc.Value,
                Nurses: nurseData.Value || 'N/A' // Default to 'N/A' if no data is found
            };
        });
    } catch (error) {
        return res.status(500).send('Error reading data');
    }

    // Filter data based on the search query
    const results = data.filter(item => 
        item.Country.toUpperCase().includes(query.toUpperCase())
    );

    res.json(results); // Return the search results as JSON
});

module.exports = router;

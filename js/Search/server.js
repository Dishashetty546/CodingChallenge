//Create a function to read the CSV file in your server.js or in a separate module.const fs = require('fs');
const express = require('express');
const path = require('path');
const searchRoutes = require('./routes/search');

const app = express();
const PORT = process.env.PORT || 3000;

// Middleware to serve static files
app.use(express.static(path.join(__dirname, 'public')));

// Use search routes
app.use('/search', searchRoutes);

// Start the server
app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});

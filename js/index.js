// 

// let message = "hello";
// let name = " world"
// let greetings= message + ' ' + name ;
// console.log(greetings);

// let text = "hello namaste";
// console.log(text[0]);

// let name= "alice";
// console.log(name.slice(1,4));

// let sentence= "hello namaste hows life going";
// console.log(sentence.indexOf("life"));
const name = 'Disha Shetty'
let initial= '';
let words= name.split('');
for(let i=0;i<name.length;i++)
{
    initial+= words[i][0].toUpperCase()+'.';

    
}
return initial;


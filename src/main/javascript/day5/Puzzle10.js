
const rl = require('readline');
const fs = require('fs');

let steps = 0;
let instructions = [];

var lineReader = rl.createInterface({
  input: fs.createReadStream('../../resources/Puzzle10Input.txt')
});

function process(index, cb) {

  let instruction = instructions[index];
  instructions[index]++;
  let newIndex = index + instruction;

  if (newIndex < 0 || newIndex >= instructions.length) {
    cb(undefined, ++steps);
  } else {
    console.log("Index: " + index + " / Steps: " + steps);
    //console.log(instructions);
    steps++;
    setImmediate(() => process(newIndex, cb));
  }
}

lineReader.on('line', function (line) {
  instructions.push(parseInt(line));
});
lineReader.on('close', function() {

  process(0, function (err, result) {

    console.log("Steps: " + result);
  });

});

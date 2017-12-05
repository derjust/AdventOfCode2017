
const rl = require('readline');
const fs = require('fs');

let steps = 0;
let xinstructions = [0,
3,
0,
1,
-3];
let instructions = [];

var lineReader = rl.createInterface({
  input: fs.createReadStream('../../resources/Puzzle10Input.txt')
});

function process(index, cb) {

  let instruction = instructions[index];
  if (instruction >= 3) {
    instructions[index]--;
  } else {
    instructions[index]++;
  }
  let newIndex = index + instruction;

  if (newIndex < 0 || newIndex >= instructions.length) {
    cb(undefined, ++steps);
  } else {
    if (steps % 1000000 == 0) {
      console.log("Index: " + index + "/" + instructions.length + " - Steps: " + steps);
    }

    steps++;
    setImmediate(() => process(newIndex, cb));
  }
}

lineReader.on('line', function (line) {
  instructions.push(parseInt(line));
});
lineReader.on('close', function() {

  process(0, function (err, result) {
    console.log(instructions);
    console.log("Steps: " + result);
  });

});

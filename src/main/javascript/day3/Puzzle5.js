
let mode = 'right';
let firstMove = true;
let stepOffset = 1;
var matrix = {
  rows: [ [1] ],
  activeRow: 0,
  currentValue: 1
};

function nextMove() {
  switch (mode) {
    case 'right':
      return 'up';
    case 'up':
      return 'left';
    case 'left':
      return 'down';
    case 'down':
      return 'right';
  }
}

function fill() {
  let steps = stepOffset;
  switch (mode) {
    case 'right':
      while (steps-- > 0) {
        matrix.rows[matrix.activeRow].push(++matrix.currentValue);
      }
    break;
    case 'up':
      while (steps-- > 0) {
        if (matrix.activeRow == 0) {
          matrix.rows.unshift([++matrix.currentValue])
        } else {
          matrix.rows[--matrix.activeRow].push(++matrix.currentValue);
        }
      }
    break;
    case 'left':
      while (steps-- > 0) {
        matrix.rows[matrix.activeRow].unshift(++matrix.currentValue);
      }
    break;
    case 'down':
      while (steps-- > 0) {
        if (matrix.activeRow  + 1>= matrix.rows.length) {
          matrix.rows.push([++matrix.currentValue])
          matrix.activeRow++;
        } else {
          matrix.rows[++matrix.activeRow].unshift(++matrix.currentValue);
        }
      }
    break;
  }

  mode = nextMove();
  if (firstMove) {
    firstMove = false;
  } else {
    firstMove = true;
    stepOffset++;
  }
}

const needle = 325489;
while (matrix.currentValue < needle) {
  fill();
}

console.log(matrix);

var foundCellRow, foundCellIndex, foundZeroRow, foundZeroIndex;
var rowIndex;
for (rowIndex = 0; rowIndex < matrix.rows.length; rowIndex++) {
  let row = matrix.rows[rowIndex];

  let zeroIndex = row.indexOf(1);
  if (zeroIndex >= 0) {
    foundZeroIndex = zeroIndex;
    foundZeroRow = rowIndex;
  }
  let cellIndex = row.indexOf(needle);
  if (cellIndex >= 0) {
    foundCellIndex = cellIndex;
    foundCellRow = rowIndex;
  }
}

console.log("Cell index: " + foundCellIndex);
console.log("Row index: " + foundCellRow);


console.log("Zero Cell index: " + foundZeroIndex);
console.log("Zero Row index: " + foundZeroRow);

var rowOffset = Math.abs(foundCellRow - foundZeroRow);
var indexOffset = Math.abs(foundCellIndex - foundZeroIndex);

console.log(rowOffset + indexOffset);

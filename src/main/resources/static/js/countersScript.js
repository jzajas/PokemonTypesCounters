const allId= ['strongAttack', 'strongDefense1', 'avoidAttack',
            'avoidDefense1', 'avoidDefense2',  'strongDefense2',
            'attackImmunity', 'defenseImmunity1', 'defenseImmunity2'
  ];


// Function to populate table
function populateCell(items, id) {
    const cell = document.getElementById(id);
    if (cell) {
        // Clearing the existing content
        cell.innerText = '';
        // Populating the cell with provided items
        items.forEach((item, index) => {
            // Creating a new paragraph element for each item
            const p = document.createElement('p');
            p.innerText = item;
            // Appending the paragraph to the cell
            cell.appendChild(p);
        });
    } else {
        console.error(`Cell with id "${id}" not found`);
    }
}


// Function that changes colors of types based on where they are located
function colorCodeTable() {
    // Creating an object to store the content of each cell
    const cellContents = {};

    // Populating cellContents with the text from each paragraph in each cell
    allId.forEach(id => {
        cellContents[id] = Array.from(document.querySelectorAll(`#${id} p`)).map(p => p.textContent);
    });

    // Coloring logic
    allId.forEach(id => {
        const paragraphs = document.querySelectorAll(`#${id} p`);
        paragraphs.forEach(p => {
            const type = p.textContent;
            const { strongAttack, strongDefense1, strongDefense2, avoidAttack, avoidDefense1, avoidDefense2,
            attackImmunity, defenseImmunity1, defenseImmunity2 } = cellContents;

//            Type is good in both offense and defense
            if (strongAttack.includes(type) && (strongDefense1.includes(type) || strongDefense2.includes(type) ||
              defenseImmunity1.includes(type) || defenseImmunity2.includes(type))) {
                p.style.color = 'green';
//            Type is bad in both offense and defense
            } else if ((avoidAttack.includes(type) || attackImmunity.includes(type)) && (avoidDefense1.includes(type) || avoidDefense2.includes(type))) {
                p.style.color = 'red';
//            Type if good in offense and bad in defense
            } else if (strongAttack.includes(type) && (avoidDefense1.includes(type) || avoidDefense2.includes(type))) {
                p.style.color = 'orange';
//            Type is bad in offense and good in defense
            } else if ((avoidAttack.includes(type) || attackImmunity.includes(type)) && (strongDefense1.includes(type) ||
              strongDefense2.includes(type) || defenseImmunity1.includes(type) || defenseImmunity2.includes(type))) {
                p.style.color = 'blue';
            }
        });
    });
}


// Function to populate a cell
function populateCell(items, id) {
    const cell = document.getElementById(id);
    if (cell) {
        // Clearing the existing content
        cell.innerText = '';
        // Populating the cell with provided items
        items.forEach((item, index) => {
            // Creating a new paragraph element for each item
            const p = document.createElement('p');
            p.innerText = item;
            // Appending the paragraph to the cell
            cell.appendChild(p);
        });
    } else {
        console.error(`Cell with id "${id}" not found`);
    }
}


// Function that populates table and applies changing colors of types
function populateTable(data, size) {
    if (Array.isArray(data) && size === 9) {
        for (let i = 0; i < 9; i++){
            populateCell(data[i], allId[i])
        }

    } else if (Array.isArray(data) && size === 4) {
        for (let i = 0; i < 4; i++){
            populateCell(data[i], allId[i])
        }
    }else{
        console.error('Unexpected data format received');
    }

    colorCodeTable();
}


// Function that gets the endpoint based on the number of rows in the table
function getEndpoint(){
    let table = document.getElementById("table")
    let rowCount = table.getElementsByTagName("tr").length;
    console.log("Number of rows:", rowCount);

    if (rowCount == 4){
        return '/api/detailed-counters';
    }else if(rowCount == 3){
        return '/api/simple-counters';
    }else{
        console.log("Incorrect row count")
    }
}
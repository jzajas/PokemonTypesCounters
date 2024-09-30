const allId= ['strongAttack', 'strongDefense1', 'avoidAttack',
            'avoidDefense1', 'avoidDefense2',  'strongDefense2',
            'attackImmunity', 'defenseImmunity1', 'defenseImmunity2'
  ];


// Function to populate a table
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
}


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
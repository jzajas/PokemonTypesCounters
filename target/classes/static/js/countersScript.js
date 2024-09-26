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
    }
}


function populateTable(data, size) {
    if (Array.isArray(data) && size === 6) {
        populateCell(data[0], 'prioritizeAttack');
        populateCell([data[1]], 'prioritizeDefense');
        populateCell(data[2], 'strongAttack');
        populateCell([data[3]], 'strongDefense');
        populateCell(data[4], 'avoidAttack');
        populateCell([data[5]], 'avoidDefense');
    } else if (Array.isArray(data) && size === 4) {
        populateCell(data[0], 'strongAttack');
        populateCell([data[1]], 'strongDefense');
        populateCell(data[2], 'avoidAttack');
        populateCell([data[3]], 'avoidDefense');
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
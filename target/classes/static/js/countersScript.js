//    TODO possibly migrate it to separate file
// Function to populate a table
function populateTable(items, id) {
        // Find the table cell with the given id
        const cell = document.getElementById(id);

        // Check if cell exists
        if (cell) {
            // Clear the existing content
            cell.innerText = '';

            // Populate the cell with the provided items
            items.forEach((item, index) => {
                // Create a new paragraph element for each item
                const p = document.createElement('p');
                p.innerText = item;

                // Append the paragraph to the cell
                cell.appendChild(p);
            });
        }
    }


//Event Listener for changing images
document.addEventListener('DOMContentLoaded', function() {
        function setupImageSelector(selectId, imageId) {
            const select = document.getElementById(selectId);
            const img = document.getElementById(imageId);

            function updateImage() {
                if (select.value) {
                    img.src = select.value;
                    img.style.display = 'block';
                } else {
                    img.style.display = 'none';
                }
            }

            // Update image on page load
            updateImage();

            // Update image when selection changes
            select.addEventListener('change', updateImage);
        }

        // Setup both image selectors
        setupImageSelector('select1', 'image1');
        setupImageSelector('select2', 'image2');
});


// Event listener for processing and displaying types chosen by user
document.getElementById('greenButton').addEventListener('click', function() {
    var select1 = document.getElementById('select1');
    var select2 = document.getElementById('select2');
    const type1 = select1.options[select1.selectedIndex]?.text || '';
    const type2 = select2.options[select2.selectedIndex]?.text || '';

    // Prepare the body data correctly
    const body = JSON.stringify({
        type1: type1,
        type2: type2
    });

    // Send the fetch POST request with the correct body
    fetch('/api/selected-types', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: body  // Use the body variable here
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Network response was not ok');
        }
        return response.json();
    })
    .then(data => {
//    TODO possibly migrate it to separate file and make it into a function
        console.log('Response from server:', data);

        if (Array.isArray(data) && data.length === 6) {
            populateTable(data[0], 'prioritizeAttack');
            populateTable([data[1]], 'prioritizeDefense');
            populateTable(data[2], 'strongAttack');
            populateTable([data[3]], 'strongDefense');
            populateTable(data[4], 'avoidAttack');
            populateTable([data[5]], 'avoidDefense');
        } else {
            console.error('Unexpected data format received');
        }
    })
    .catch((error) => {
        console.error('Error:', error);
        alert('An error occurred. Please try again.');
    });
});
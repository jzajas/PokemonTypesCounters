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

    // Preparing body data
    const body = JSON.stringify({
        type1: type1,
        type2: type2
    });

    var endpoint = getEndpoint();

    fetch('/api/' + endpoint, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: body
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Network response was not ok');
        }
        return response.json();
    })
    .then(data => {
        console.log('Response from server:', data);
        let size = data.length

        populateTable(data, size);
    })
    .catch((error) => {
        console.error('Error:', error);
        alert('An error occurred. Please try again.');
    });
});
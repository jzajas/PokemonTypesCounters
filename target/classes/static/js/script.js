function handleImageSelection(selectElementId, imageContainerId, nameElementId) {
    const selectElement = document.getElementById(selectElementId);
    const imageContainer = document.getElementById(imageContainerId);
    const nameElement = document.getElementById(nameElementId);

    if (!selectElement) {
        console.error(`Select element with id ${selectElementId} not found.`);
        return;
    }

    selectElement.addEventListener('change', function () {
        const imageUrl = this.value;
        const imageName = this.options[this.selectedIndex].text;

        // Clear the current image and name
        imageContainer.innerHTML = '';
        nameElement.textContent = '';

        if (imageUrl) {
            // Create and append the image element
            const img = document.createElement('img');
            img.src = imageUrl;
            img.alt = imageName;
            imageContainer.appendChild(img);

            // Set the name
            nameElement.textContent = imageName;
        }
    });
}

function getSelectedImageNames() {
    const select1 = document.getElementById('select1');
    const select2 = document.getElementById('select2');
    const name1 = select1.options[select1.selectedIndex]?.text || '';
    const name2 = select2.options[select2.selectedIndex]?.text || '';

    // Return the names as an object
    return { name1, name2 };
}

document.getElementById('greenButton').addEventListener('click', function() {
    const selectedNames = getSelectedImageNames();
    console.log(selectedNames); // For testing purposes, print to console

    // Correct endpoint URL
    fetch('/api/save-selected-names', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(selectedNames)
    })
    .then(response => response.text()) // Change to .text() if the response is plain text
    .then(text => {
        console.log('Success:', text);
    })
    .catch((error) => console.error('Error:', error));
});

// Initialize the image selectors
handleImageSelection('select1', 'imageContainer1', 'name1');
handleImageSelection('select2', 'imageContainer2', 'name2');

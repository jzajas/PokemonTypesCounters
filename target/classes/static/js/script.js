document.addEventListener('DOMContentLoaded', function() {
    const select = document.getElementById('select1');
    const img = document.getElementById('selectedImage');

    // Function to update the image
    function updateImage() {
        img.src = select.value;
    }

    // Update image on page load
    updateImage();

    // Update image when selection changes
    select.addEventListener('change', updateImage);
});

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

document.getElementById('greenButton').addEventListener('click', function () {
        fetch('/api/get-selected-names')
            .then(response => response.json())
            .then(data => {
                const namesContainer = document.getElementById('selectedNames');
                namesContainer.innerHTML = '';

                data.forEach(name => {
                    const p = document.createElement('p');
                    p.textContent = name;
                    namesContainer.appendChild(p);
                });
            })
            .catch(error => console.error('Error fetching selected names:', error));
    });



// Initialize the image selectors
handleImageSelection('select1', 'imageContainer1', 'name1');
handleImageSelection('select2', 'imageContainer2', 'name2');

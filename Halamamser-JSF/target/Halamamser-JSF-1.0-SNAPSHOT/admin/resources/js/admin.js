function viewAllProducts(){
    document.getElementById('view-all-products-container').style.display = "block";
    document.getElementById('view-all-orders-container').style.display = "none";
    document.getElementById('create-new-product-container').style.display = "none";
    document.getElementById('active-label').style.display = "block";
    document.getElementById('active-label').style.backgroundColor = "#896978";
}

function viewAllOrders(){
    document.getElementById('view-all-orders-container').style.display = "block";
    document.getElementById('view-all-products-container').style.display = "none";
    document.getElementById('create-new-product-container').style.display = "none";
    document.getElementById('active-label').style.display = "block";
    document.getElementById('active-label').style.backgroundColor = "#AAC0AF";
}

function createNewProduct(){
    document.getElementById('view-all-orders-container').style.display = "none";
    document.getElementById('view-all-products-container').style.display = "none";
    document.getElementById('create-new-product-container').style.display = "block";
    document.getElementById('active-label').style.display = "block";
    document.getElementById('active-label').style.backgroundColor = "#839791";
}
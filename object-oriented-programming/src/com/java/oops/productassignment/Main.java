package com.java.oops.productassignment;


    public class Main {
        public static void main(String[] args) {
            CsvReader csvReader = new CsvReader();


            ProductService productService = new ProductService(csvReader);
            System.out.println(productService.getAllProducts());
            Product product = new Product();
            product.setId(51);
            product.setName("Samsung TV");
            product.setMaxRetailPrice(32432);
            product.setDiscountPercentage(10);
            product.setAvailable(true);
            product.setCategory(Category.ELECTRONICS);
            product.setCompany(Company.APPLE);
            product.setManufacturedYear(2023);
            productService.addProduct(product);


            System.out.println(productService.getAllProducts());

        }
    }


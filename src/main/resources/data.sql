-- Insert data into product table
INSERT INTO product (id, name, price, category, discount, star_count, deleted, created_at) VALUES (1, 'Product A', 19.99, 'Electronics', 10, 4, false, '2023-05-29 14:30:00');
INSERT INTO product (id, name, price, category, discount, star_count, deleted, created_at) VALUES (2, 'Product B', 5.49, 'Books', 0, 5, false, '2023-05-29 15:00:00');
INSERT INTO product (id, name, price, category, discount, star_count, deleted, created_at) VALUES (3, 'Product C', 99.95, 'Home Appliances', 20, 3, true, '2023-05-29 16:00:00');
INSERT INTO product (id, name, price, category, discount, star_count, deleted, created_at) VALUES (4, 'Product D', 45.00, 'Clothing', 15, 4, false, '2023-05-29 17:00:00');
INSERT INTO product (id, name, price, category, discount, star_count, deleted, created_at) VALUES (5, 'Product E', 12.75, 'Accessories', 5, 5, false, '2023-05-29 18:00:00');
INSERT INTO product (id, name, price, category, discount, star_count, deleted, created_at) VALUES (6, 'Product F', 250.00, 'Electronics', 25, 3, false, '2023-05-29 19:00:00');

-- Insert data into review table
INSERT INTO review (id, comment, number_of_stars, product_id) VALUES (1, 'Great product!', 5, 1);
INSERT INTO review (id, comment, number_of_stars, product_id) VALUES (2, 'Good value for money', 4, 2);
INSERT INTO review (id, comment, number_of_stars, product_id) VALUES (3, 'Satisfactory performance', 3, 3);
INSERT INTO review (id, comment, number_of_stars, product_id) VALUES (4, 'Not as expected', 2, 4);
INSERT INTO review (id, comment, number_of_stars, product_id) VALUES (5, 'Excellent quality!', 5, 5);
INSERT INTO review (id, comment, number_of_stars, product_id) VALUES (6, 'Would buy again', 4, 6);

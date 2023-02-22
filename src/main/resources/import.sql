INSERT INTO tb_package (name) VALUES ('Galão de 2 Litros');
INSERT INTO tb_package (name) VALUES ('Galão de 5 Litros');
INSERT INTO tb_package (name) VALUES ('Fardo com 8 Rolos 30m');

INSERT INTO tb_product (name, price) VALUES ('Desinfetante Clorado',60.99);
INSERT INTO tb_product (name, price) VALUES ('Desinfetante Quaternário de Amônio',150.99);
INSERT INTO tb_product (name, price) VALUES ('Detergente Neutro',20.50);
INSERT INTO tb_product (name, price) VALUES ('Papel Higiênico com 8 Rolos',200.99);

INSERT INTO tb_product_package (product_id, package_id) VALUES (1,1);
INSERT INTO tb_product_package (product_id, package_id) VALUES (1,2);
INSERT INTO tb_product_package (product_id, package_id) VALUES (2,1);
INSERT INTO tb_product_package (product_id, package_id) VALUES (2,2);
INSERT INTO tb_product_package (product_id, package_id) VALUES (3,2);
INSERT INTO tb_product_package (product_id, package_id) VALUES (4,3);

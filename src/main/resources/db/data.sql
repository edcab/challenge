-- Insertar datos en la tabla User
INSERT INTO User (ID, NAME)
VALUES
    (1, 'Juan'),
    (2, 'Maria'),
    (3, 'Pedro');

-- Insertar datos en la tabla Review
INSERT INTO Review (id, rating, comment, item, User)
VALUES
    (1, 5, 'Excelente producto', 1, 1),
    (2, 3, 'Buen producto', 2, 2),
    (3, 2, 'Producto regular', 1, 3),
    (4, 4, 'Muy buen producto', 3, 1),
    (5, 1, 'Producto malo', 2, 3);

-- Insertar datos en la tabla Item
INSERT INTO Item (id, title, description, reviews)
VALUES
    (1, 'Producto 1', 'Descripción del producto 1', 2),
    (2, 'Producto 2', 'Descripción del producto 2', 2),
    (3, 'Producto 3', 'Descripción del producto 3', 1);
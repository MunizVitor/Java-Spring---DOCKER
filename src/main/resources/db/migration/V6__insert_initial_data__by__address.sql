INSERT INTO address (city, uf, event_id)
VALUES
('São Paulo', 'SP', (SELECT id FROM event WHERE title = 'Spring Boot Workshop')),
('Rio de Janeiro', 'RJ', (SELECT id FROM event WHERE title = 'Tech Conference')),
('Curitiba', 'PR', (SELECT id FROM event WHERE title = 'Hackathon'));

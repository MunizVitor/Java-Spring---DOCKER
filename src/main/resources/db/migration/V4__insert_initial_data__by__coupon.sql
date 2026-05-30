INSERT INTO coupon (code, discount, valid, event_id)
VALUES
('PROMO10', 10, '2026-06-30 23:59:59', (SELECT id FROM event WHERE title = 'Spring Boot Workshop')),
('PROMO20', 20, '2026-07-15 23:59:59', (SELECT id FROM event WHERE title = 'Tech Conference')),
('HACK50', 50, '2026-08-25 23:59:59', (SELECT id FROM event WHERE title = 'Hackathon'));

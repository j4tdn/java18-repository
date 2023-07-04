-- disable all fks
SET FOREIGN_KEY_CHECKS = 0;

DELETE FROM `item_detail`;
DELETE FROM `employee_title`;
DELETE FROM `order_detail`;
DELETE FROM `order_delivery_status_detail`;
DELETE FROM `item`;
DELETE FROM `employee`;
DELETE FROM `bill`;
DELETE FROM `order`;
DELETE FROM `customer`;
DELETE FROM `size`;
DELETE FROM `payment_method`;
DELETE FROM `title`;
DELETE FROM `department`;
DELETE FROM `provider`;
DELETE FROM `item_group`;
DELETE FROM `delivery_status`;

-- enable all fks
SET FOREIGN_KEY_CHECKS = 1;
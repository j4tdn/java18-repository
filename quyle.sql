SELECT * FROM `delivery_status`;
SELECT * FROM `item_group`;
SELECT * FROM `provider`;
SELECT * FROM `department`;
SELECT * FROM `title`;
SELECT * FROM `payment_method`;
SELECT * FROM `size`;
SELECT * FROM `customer`;
SELECT * FROM `order`;
SELECT * FROM `bill`;
SELECT * FROM `employee`;
SELECT * FROM `item`;
SELECT * FROM `order_delivery_status_detail`;
SELECT * FROM `order_detail`;
SELECT * FROM `employee_title`;
SELECT * FROM `item_detail`;

-- cau 1
SELECT it.ID id,
	   it.NAME namee,
       od.CREATED_AT created_at
  FROM `order` od
  JOIN order_detail odt
    ON od.ID = odt.ORDER_ID
  JOIN item it
    ON it.ID = odt.ITEM_DETAIL_ID
WHERE DATE(CREATED_AT) = '2023-07-25';

-- cau 2
SELECT itg.ID id,
	   itg.`NAME` namee,
       SUM(itd.AMOUNT) amount_of_items
  FROM item_detail itd
  JOIN item_group itg
    ON itd.ITEM_ID = itg.ID
  GROUP BY itg.ID;
  
-- cau 3
SELECT it.ID id,
       it.`name` namee,
       SUM(itd.AMOUNT) amount
  FROM item it
  JOIN item_detail itd
    ON it.ID = itd.ITEM_ID
GROUP BY it.ID
ORDER BY amount DESC 
LIMIT 3;

-- cau 4

SELECT * FROM item;


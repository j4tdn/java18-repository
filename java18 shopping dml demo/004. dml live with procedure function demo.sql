-- when create a new procedure, function
-- reuse, avoid duplicated sql code

-- procedure : return void
-- function : return value(exception table[mysql])

-- viết phương thức liệt kê các mặt hàng theo  loại hàng
delimiter $$
create procedure select_item(item_group varchar(100))
begin
	Select * from item i  join item_group ig on i.item_group_id = ig.id where ig.name = item_group;
end
 $$

call select_item('Mũ');

delimiter $$
create procedure insert_data(Nrows int)
begin
	declare i,new_id int;
    declare current_max_id INT ;
    set i = 0,new_id = 0,current_max_id = (select count(*) id_max from item_group);
	while(i<Nrows) do
		set new_id = current_max_id +i+1 ;
		Insert into item_group(id,name) value (new_id,concat('LH', new_id));
        set i = i+1;
	end while	;
end
$$
call insert_data (3);
delimiter $$
create function sumInt(N int)
returns int
begin
	declare i,sum int;
    set i = 0,sum = 0;
    while (i< N) do
		set sum = sum +i;
        set i = i +2;
	end while;
    return sum;
end
$$

select  sumInt(11);


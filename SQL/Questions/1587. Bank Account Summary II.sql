select name, sum(amount) as balance 
from users as table1
join transactions as table2 
on table1.account = table2.account 
group by name
having balance > 10000
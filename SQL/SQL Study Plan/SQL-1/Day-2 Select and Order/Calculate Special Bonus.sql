select employee_id,
case 
	when (mod(employee_id,2) = 1) and (name not like 'M%') then salary
	else 0
end as bonus
from employees
order by 1. ## it means order by the very first column from the select list
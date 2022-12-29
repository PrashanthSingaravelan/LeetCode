select vs.customer_id, count(*) as count_no_trans from Visits vs
left join Transactions tr on tr.visit_id = vs.visit_id
where tr.visit_id is NULL
group by vs.customer_id
order by count_no_trans desc;
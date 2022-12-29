select stock_name, sum(if(operation="sell",price,-price)) as capital_gain_loss 
from Stocks group by stock_name

select stock_name, 
	   sell_price - buy_price as capital_gain_loss
from (
select stock_name, 
	   sum(case when operation="buy" then price else 0 end) as sell_price,
       sum(case when operation="sell" then price else 0 end) as buy_price
from stocks
group by stock_name 
) x
order by stock_name
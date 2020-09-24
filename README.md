# KotlinSpringBoot
Data Structure
-----------------------------------------------------------------------------
PRODUCT	- ID, NAME, DESC, CATEGORY, VALID FROM, VALID TO, QTY

PRODUCT_PRICE - ID, PRODUCT_ID, AMOUNT, CURRENCY, VALID FROM, VALID TO

ORDER_DETAILS - ORDER_ID, PRODUCT_ID, TOTAL PRICE

TRANSPORT - ID, ORDER_ID, STAGE_ID, STATUS, START TIME, END_TIME
------------------------------------------------------------------------------
ENDPOINTS
-----------------------------------------------------------------



1.Save Product data from Product Json
POST - http://localhost:8080/api/product
{
"PRODUCT_ID":"35",
"NAME":"Chair",
"DESCRIPTION":"Good Quality",
"CATEGORY":"ABC",
"VALID_FROM":"2020-12-12",
"VALID_TO":"2022-12-12",
"QTY":"2"
}
----------------------------------------------------------------
2. Save Product Price data from Product Price Json
POST - http://localhost:8080/api/price
{
"PRODUCT_ID":"35",
"AMOUNT":"1000",
"CURRENCY":"IND",
"VALID_FROM":"2020-12-12",
"VALID_TO":"2022-12-12"
}
----------------------------------------------------------------
3. Save Order Data
IT will check the Stock in Hand and validity of the product before placing the order. It will push default 
values to Transport table also. It will also calculate the total price based on the quantity we enter.
POST - http://localhost:8080/api/order/35/1 where PRODUCT_ID - 35, Quantity - 1
----------------------------------------------------------------
4. Check Product available for specified quantity and valid as of today
GET - http://localhost:8080/api/product/35/1 where PRODUCT_ID - 35, Quantity - 1
----------------------------------------------------------------
5. Calculate total price for a product with specified quantity and valid as of today
GET - http://localhost:8080/api/totalprice/35/1 where PRODUCT_ID - 35, Quantity - 1
----------------------------------------------------------------
6. Get Order by ID
GET -http://localhost:8080/api/order/12 where ORDER_ID - 12
----------------------------------------------------------------
7. Get transport status by order id
GET - http://localhost:8080/api/transport/12 where ORDER_ID - 12
----------------------------------------------------------------


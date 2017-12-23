# Hibernate_Pagination_With_Servlet_JSP_Maven
when response for request is too large [If we have 1000’s of records in the database] then instead of displaying all records at a time on browser  we can display the response page by page manner using pagination mechanism

In pagination, initially one page response will be displayed and we will get links for getting the next pages response
In this servelt & hibernate integration, we are going to display  4 records or 4 objects of products using hibernate for selecting the data and we will get links to display the records of the next pages
 

# Regarding Logic  In Order To Get pagination

1. The servlet accepts pageIndex parameter and if the parameter is passed then servlet takes the given number as pageIndex, otherwise the servlet will takes the pageIndex as one [ 1  ]

2. Servlet uses Criteria API and the pagination methods of Criteria for loading the records (objects) related to that particular page, and servlet display those records on the browser

3. In servlet we use Criteria with projection for finding the total number of records available in the table, and we store that number into the variable

4. We will find out the number of hyperlinks required by dividing the total number of records with records per page

5. we need to use a loop in order to display the links on the browser, while creating each link,  we use the <a href  /> to servlet url pattern [Hiper reference] and by passing that page nomber as value for pageIndex parameter

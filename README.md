# Makersharks Search API

This project is a proof of concept for a search API that allows buyers to search for manufacturers based on their customized requirements. The API is built using Spring Boot and provides endpoints to add suppliers and search for them based on various criteria.

## Table of Contents
- [Getting Started](#getting-started)
- [API Endpoints](#api-endpoints)
  - [Add a Supplier (POST https http://localhost:8080/api/suppliers/add/Tech%20Innovators/techinnovators.com/India/small_scale/3d_printing,casting)
  - [Search for Suppliers (GET / http://localhost:8080/api/suppliers/search?location=India&natureOfBusiness=small_scale&process=3d_printing)


## Getting Started

### Prerequisites

- Java 17 or higher
- Maven or Gradle
- Postman (optional, for testing)

### Installation

1. **Clone the repository**:
   
   git clone https://github.com/deva0916/Makersharks_Assessment.git
   cd makersharks-search-api

Using Postman to Request and Response the Endpoints

API Documentation
Supplier API
Base URL
bash
Copy code
http://localhost:8080/api/suppliers
1. Add Supplier
Endpoint: POST http://localhost:8080/api/suppliers/add/Tech%20Innovators/techinnovators.com/India/small_scale/3d_printing,casting
Description: Adds a new supplier with the specified details.
Request:
•	Method: POST
•	URL: http://localhost:8080/api/suppliers/add/{companyName}/{website}/{location}/{natureOfBusiness}/{manufacturingProcesses}
•	URL Parameters:
o	companyName (string): Name of the company
o	website (string): Website URL of the company
o	location (string): Location of the company
o	natureOfBusiness (string): Nature of business
o	manufacturingProcesses (string): Description of manufacturing processes
Response:
•	Status Code: 200 OK
•	Content-Type: application/json
•	Body:
json
Copy code
{
  "id": 1,
  "companyName": "Example Co.",
  "website": "http://example.com",
  "location": "New York",
  "natureOfBusiness": "Manufacturing",
  "manufacturingProcesses": "Injection Molding"
}
Example Request:
ruby
Copy code
POST http://localhost:8080/api/suppliers/add/{companyName}/{website}/{location}/{natureOfBusiness}/{manufacturingProcesses}
Example Response:
json
Copy code
{
  "id": 1,
  "companyName": "Example Co.",
  "website": "http://example.com",
  "location": "New York",
  "natureOfBusiness": "Manufacturing",
  "manufacturingProcesses": "Injection Molding"
}
2. Search Suppliers
Endpoint: GET /search
Description: Searches for suppliers based on location, nature of business, and manufacturing processes.
Request:
•	Method: GET
•	URL: http://localhost:8080/api/suppliers/search?location=India&natureOfBusiness=small_scale&process=3d_printingQuery Parameters:
o	location (string): Location of the suppliers
o	natureOfBusiness (string): Nature of business of the suppliers
o	process (string): Manufacturing processes of the suppliers
Response:
•	Status Code: 200 OK
•	Content-Type: application/json
•	Body:
json
Copy code
[
  {
    "id": 1,
    "companyName": "Example Co.",
    "website": "http://example.com",
    "location": "New York",
    "natureOfBusiness": "Manufacturing",
    "manufacturingProcesses": "Injection Molding"
  }
]
Example Request:
perl
Copy code
GET http://localhost:8080/api/suppliers/search?location=New%20York&natureOfBusiness=Manufacturing&process=Injection%20Molding
Example Response:
json
Copy code
[
  {
    "id": 1,
    "companyName": "Example Co.",
    "website": "http://example.com",
    "location": "New York",
    "natureOfBusiness": "Manufacturing",
    "manufacturingProcesses": "Injection Molding"
  }
]

Testing the API with Postman
1.	Add a Supplier
o	Method: POST
o	URL: http://localhost:8080/api/suppliers/add/Tech%20Innovators/techinnovators.com/India/small_scale/3d_printing,casting
o	Headers: Content-Type: application/json
2.	Body: Use raw JSON 
3.	Copy code
4.	{
5.	    "companyName": "Tech Innovators",
6.	    "website": "http://techinnovators.com",
7.	    "location": "India",
8.	    "natureOfBusiness": "small_scale",
9.	    "manufacturingProcesses": "3d_printing, casting"
10.	}
11.	
12.	Search for Suppliers
o	Method: GET
o	URL: http://localhost:8080/api/suppliers/search?location=India&natureOfBusiness=small_scale&process=3d_printing 
o	Params: Add query parameters location, natureOfBusiness, and process.


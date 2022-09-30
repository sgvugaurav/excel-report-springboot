# Excel Report Generator Application
This, [excel-report-generator](https://azureappservicezombie.azurewebsites.net/) is a Spring Boot web application that performs simple CRUD operations on invoices and the application has capability to generate **Excel Report** of all the available invoices.

## Tools & Technologies Used
- Java 8
- Spring Boot
- Spring Data JPA
- Apache POI
- Thymeleaf (Template Engine for creating UI)
- IntelliJ Idea (For Development)
- Azure Toolkit for IntelliJ (For Deployment of the application right from the IDE)
- Azure Portal (For creating azure services)
- Azure Database for MySQL servers
- Azure App Services (For Deployment)

## Application Tour
Let us now discover the different functionalities of the application.

### Home Page
The home page of the application has a very simple UI with two buttons. First on the left gives you the option to add new invoices and clicking on the second button shows you all the invoice entries.

![HomePage](/images/home.png)

### Invoices Page
Here you can see all the invoice entries. You get option to edit and delete invoice from here. You can also add one or more invoice as well as you can navigate to the home page.

You also get the option to generate **Excel Report** of the invoice entries here.

![InvoicesPage](/images/showInvoices.png)

### Add Invoice
On this page you can fill the details with invoice and clicking on `Save Invoice` button saves the invoice in the persistence medium.

![AddInvoice](/images/AddInvoice.png)

### Update Invoice
If you want to edit a particular invoice entry then from the **Show All Invoices** page you can click on `Edit` button on the right. You can modify the details and clicking on the `Update` button modifies the entry.

![UpdateInvoice](/images/UpdateInvoice.png)

## Use of Azure
The project has been deployed on Azure platform. Azure database for MySQL server has been used to persist the invoices and Azure App Services, which is an azure's PaaS offering has been used to deploy the application.

First you develop the application in your local environment where you use local JavaSE runtime and MySQL on localhost.

Once the application is developed and running fine on the local environment, we can create azure services needed to run the application in the cloud.
Here, I have created, broadly speaking, two services:
1. Azure database for MySQL servers and
2. Azure App Services

using azure portal.

Once the application has been developed you need to configure your application so that it can run on the cloud. In this application I needed to just configure the datasource so that the data could be persisted in azure's mysql database.

After the application has been configured for cloud environment, I used Azure Toolkit for IntelliJ that helps us deploy the application right from the IntelliJ Idea IDE.

## Demo
Live Application: https://azureappservicezombie.azurewebsites.net/

Application Tour Video: https://youtu.be/0d6zW4sIQ1o
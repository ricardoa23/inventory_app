# Inventory Management System

## Project Overview

This project is an inspired version of the TCMax inventory management system, originally designed for tool tracking in the Air Force, adapted here for police force inventory management. The application can be used to track tools and equipment as well for non-police entities This application tracks various items such as weapons, equipment, vehicles, and specialized items, providing features for check-outs, maintenance logs, and user role-based access.

## Tech Stack

- **Frontend**: [Next.js](https://nextjs.org/) with TypeScript
- **Backend**: [Spring Boot](https://spring.io/projects/spring-boot) with Java
- **Database**: MySQL, using Spring Data JPA for ORM
- **Security**: Spring Security for role-based access and authentication
- **Data Visualization**: Recharts (or similar) for charts and graphs in inventory dashboards

## Features

- **Role-Based Access Control (RBAC)**: Assigns specific roles to users, like Admin, Technician, and Supervisor, to control access to different sections of the application.
- **Comprehensive Inventory Tracking**: Manages inventory with additional specialized fields for weapons, vehicles, and other police force items.
- **Maintenance Logs**: Tracks maintenance history, including last service dates and upcoming maintenance schedules.
- **Check-Out/Check-In System**: Allows users to check out and return items, with logs to ensure accountability.
- **Data Visualization**: Includes graphs and dashboards for a visual overview of inventory, maintenance schedules, and check-out statuses.

## Deployment

*This project will be hosted on a server for portfolio display. Detailed setup instructions will be provided upon request if necessary.*

## AI Usage Disclaimer

Wherever AI is used in this project, it will be explicitly noted. AI generation will only be utilized for generating time-consuming code such as enums, repetitive configuration files, or test sample code. All core application logic, security configurations, and business-critical code are manually crafted to maintain quality and security standards.

## README Disclaimer

*This README will be updated as other changes are made to the project and features are finalized*

## Project Structure

```plaintext
.
├── frontend               # Next.js frontend with TypeScript
└── backend                # Spring Boot backend with Java
    ├── src
    │   ├── main
    │   │   ├── java
    │   │   └── resources
    │   └── test           # Unit and integration tests
    └── pom.xml            # Maven dependencies

# 🤖 HireSense - AI-Powered Job Portal

**HireSense** is a full-stack, AI-powered job portal developed using **Java, JSP, Servlets, JDBC, and MySQL**.

The platform connects **job seekers and recruiters** through a centralized web application. Job seekers can create profiles, upload resumes, search and apply for jobs, while recruiters can post job opportunities, manage applications, and find suitable candidates.

The application also incorporates **AI-powered features** to assist with resume analysis, skill extraction, job recommendations, and candidate-job matching.

---

## 📌 Overview

Finding the right job and hiring the right candidate can be time-consuming. HireSense aims to simplify this process by providing an intelligent platform for both sides of the recruitment process.

### For Job Seekers

* Create an account
* Build a professional profile
* Upload resumes
* Search for jobs
* Filter jobs
* View job details
* Apply for jobs
* Track applications
* Receive AI-powered job recommendations
* Analyze resume and skills

### For Recruiters

* Create an account
* Create company profile
* Post job vacancies
* Manage job postings
* View applicants
* View candidate profiles
* Review resumes
* Manage application status
* Get AI-assisted candidate matching

---

# ✨ Features

## 🔐 Authentication & Authorization

* User registration
* User login
* User logout
* Session management
* Role-based access
* Separate recruiter and job-seeker dashboards

## 👨‍💻 Job Seeker Module

* Job seeker registration
* Profile management
* Resume upload
* Resume management
* Job search
* Job filtering
* Job details
* Job application
* Saved jobs
* Application tracking
* AI-powered job recommendations

## 🏢 Recruiter Module

* Recruiter registration
* Company profile management
* Create job postings
* Edit job postings
* Delete job postings
* View job postings
* View applicants
* View candidate profiles
* Resume viewing
* Application management

## 🤖 AI-Powered Features

HireSense uses AI to assist users with:

* Resume analysis
* Resume information extraction
* Skill extraction
* Job description analysis
* Candidate-job matching
* Job recommendations
* Skill-gap identification

> AI-generated recommendations are designed to assist users and should not be used as the sole basis for employment decisions.

---

# 🛠️ Technology Stack

## Frontend

| Technology | Purpose                   |
| ---------- | ------------------------- |
| HTML5      | Page structure            |
| CSS3       | Styling                   |
| JavaScript | Client-side functionality |
| JSP        | Dynamic web pages         |
| Bootstrap  | Responsive UI             |

## Backend

| Technology    | Purpose                            |
| ------------- | ---------------------------------- |
| Java          | Core programming language          |
| Servlets      | Request handling and business flow |
| JSP           | Server-side presentation           |
| JDBC          | Database connectivity              |
| Apache Tomcat | Web application server             |

## Database

| Technology        | Purpose                 |
| ----------------- | ----------------------- |
| MySQL             | Application database    |
| MySQL Connector/J | Java-MySQL connectivity |

## AI

* AI API / NLP
* Resume text processing
* Skill extraction
* Job matching
* Recommendation generation

## Development Tools

* Eclipse / IntelliJ IDEA / NetBeans
* MySQL Workbench
* Apache Tomcat
* Postman
* Git
* GitHub

---

# 🏗️ Architecture

HireSense follows a layered architecture based on the **MVC pattern**.

```text
                         ┌─────────────────────┐
                         │      USER           │
                         │ Job Seeker/Recruiter│
                         └──────────┬──────────┘
                                    │
                                    ▼
                         ┌─────────────────────┐
                         │       JSP           │
                         │    Presentation     │
                         └──────────┬──────────┘
                                    │
                                    ▼
                         ┌─────────────────────┐
                         │      SERVLETS       │
                         │     Controller      │
                         └──────────┬──────────┘
                                    │
                                    ▼
                         ┌─────────────────────┐
                         │       DAO           │
                         │   Data Access       │
                         └──────────┬──────────┘
                                    │
                                    ▼
                         ┌─────────────────────┐
                         │       JDBC          │
                         │ Database Connection │
                         └──────────┬──────────┘
                                    │
                                    ▼
                         ┌─────────────────────┐
                         │       MySQL         │
                         │      Database       │
                         └─────────────────────┘

                                    │
                                    │
                                    ▼
                         ┌─────────────────────┐
                         │     AI SERVICE      │
                         │ Resume/Job Analysis │
                         └─────────────────────┘
```

---

# 🧩 MVC Architecture

The application follows the **Model-View-Controller (MVC)** design pattern.

### Model

Java classes representing application data.

Examples:

```text
User
Job
Resume
Application
Company
Skill
```

### View

JSP pages responsible for displaying information to users.

Examples:

```text
login.jsp
register.jsp
dashboard.jsp
jobs.jsp
profile.jsp
applications.jsp
```

### Controller

Java Servlets handle HTTP requests and control application flow.

Examples:

```text
LoginServlet
RegisterServlet
JobServlet
ApplicationServlet
ResumeServlet
RecruiterServlet
```

---

# 📂 Project Structure

```text
HireSense/
│
├── src/
│   └── main/
│       │
│       ├── java/
│       │   └── com/
│       │       └── hiresense/
│       │
│       │           ├── controller/
│       │           │   ├── LoginServlet.java
│       │           │   ├── RegisterServlet.java
│       │           │   ├── LogoutServlet.java
│       │           │   ├── JobServlet.java
│       │           │   ├── ApplicationServlet.java
│       │           │   ├── ResumeServlet.java
│       │           │   └── RecruiterServlet.java
│       │           │
│       │           ├── model/
│       │           │   ├── User.java
│       │           │   ├── Job.java
│       │           │   ├── Resume.java
│       │           │   ├── Application.java
│       │           │   ├── Company.java
│       │           │   └── Skill.java
│       │           │
│       │           ├── dao/
│       │           │   ├── UserDAO.java
│       │           │   ├── JobDAO.java
│       │           │   ├── ResumeDAO.java
│       │           │   └── ApplicationDAO.java
│       │           │
│       │           ├── service/
│       │           │   ├── UserService.java
│       │           │   ├── JobService.java
│       │           │   └── AIService.java
│       │           │
│       │           └── util/
│       │               └── DBConnection.java
│       │
│       └── webapp/
│           │
│           ├── css/
│           ├── js/
│           ├── images/
│           │
│           ├── index.jsp
│           ├── login.jsp
│           ├── register.jsp
│           ├── jobs.jsp
│           ├── job-details.jsp
│           ├── profile.jsp
│           ├── resume.jsp
│           │
│           ├── seeker/
│           │   ├── dashboard.jsp
│           │   ├── applications.jsp
│           │   └── recommendations.jsp
│           │
│           └── recruiter/
│               ├── dashboard.jsp
│               ├── post-job.jsp
│               ├── manage-jobs.jsp
│               └── applicants.jsp
│
├── WEB-INF/
│   └── web.xml
│
├── lib/
│   └── mysql-connector-j.jar
│
├── database/
│   └── hiresense.sql
│
├── README.md
└── .gitignore
```

---

# 🗄️ Database Design

HireSense uses **MySQL** for storing application data.

### Main Tables

```text
users
companies
jobs
resumes
skills
applications
```

### Database Relationship

```text
                    ┌──────────────┐
                    │    USERS     │
                    └──────┬───────┘
                           │
              ┌────────────┼────────────┐
              │                         │
              ▼                         ▼
       ┌─────────────┐           ┌─────────────┐
       │   RESUMES   │           │  COMPANIES  │
       └─────────────┘           └──────┬──────┘
                                        │
                                        ▼
                                  ┌───────────┐
                                  │   JOBS    │
                                  └─────┬─────┘
                                        │
                                        ▼
                                ┌──────────────┐
                                │ APPLICATIONS │
                                └──────────────┘
```

---

# ⚙️ Requirements

Before running HireSense, install:

* **JDK 8 or higher**
* **Apache Tomcat 9/10**
* **MySQL 8 or higher**
* **Eclipse / IntelliJ IDEA / NetBeans**
* **MySQL Workbench**
* **Git**

Verify Java:

```bash
java -version
```

Verify MySQL:

```bash
mysql --version
```

---

# 📥 Installation

## 1. Clone the Repository

```bash
git clone https://github.com/your-username/hiresense.git
```

Navigate to the project:

```bash
cd hiresense
```

---

# 🗄️ Database Setup

Create the database in MySQL:

```sql
CREATE DATABASE hiresense;
```

Select the database:

```sql
USE hiresense;
```

Import the database file:

```bash
mysql -u root -p hiresense < database/hiresense.sql
```

Or open:

```text
database/hiresense.sql
```

in MySQL Workbench and execute it.

---

# 🔌 Database Configuration

Update the database connection in:

```text
DBConnection.java
```

Example:

```java
private static final String URL =
        "jdbc:mysql://localhost:3306/hiresense";

private static final String USER = "root";

private static final String PASSWORD =
        "your_password";
```

Make sure the MySQL Connector/J library is added to the project.

---

# 📦 MySQL Connector

Download and add the **MySQL Connector/J** library to the application's classpath.

Example:

```text
mysql-connector-j.jar
```

For a traditional Servlet/JSP project, the driver should be available to the web application.

---

# 🚀 Running the Application

## Step 1 — Start MySQL

Start your MySQL server.

## Step 2 — Configure Tomcat

Add Apache Tomcat to your IDE.

## Step 3 — Deploy Application

Deploy the `HireSense` web application to Tomcat.

## Step 4 — Start Tomcat

Run the project on the Tomcat server.

## Step 5 — Open Browser

```text
http://localhost:8080/HireSense/
```

The exact URL may vary depending on the configured Tomcat context path.

---

# 🔄 Job Seeker Workflow

```text
              Register
                  ↓
                Login
                  ↓
           Create Profile
                  ↓
           Upload Resume
                  ↓
         AI Resume Analysis
                  ↓
          Extract Skills
                  ↓
          Search for Jobs
                  ↓
        AI Job Recommendations
                  ↓
             Apply
                  ↓
       Track Application
```

---

# 🔄 Recruiter Workflow

```text
              Register
                  ↓
                Login
                  ↓
        Create Company Profile
                  ↓
             Post Job
                  ↓
       Receive Applications
                  ↓
        View Candidate Profile
                  ↓
         Review Resume
                  ↓
     AI Candidate-Job Matching
                  ↓
       Update Application Status
```

---

# 🤖 AI Job Matching

The AI component analyzes candidate information and job requirements to identify relevant matches.

### Candidate Profile

```text
Skills:
Java
Servlet
JSP
MySQL
HTML
CSS
```

### Job Requirements

```text
Skills:
Java
Servlet
JSP
MySQL
Spring
```

### AI Analysis

```text
Java       ✓
Servlet    ✓
JSP        ✓
MySQL      ✓
Spring     -
```

The matching information can be used to provide job recommendations to candidates or assist recruiters while reviewing applications.

---

# 🔐 Security

The application implements or can implement the following security practices:

* Session-based authentication
* Role-based authorization
* Password hashing
* Input validation
* Prepared statements
* SQL injection protection
* Secure file uploads
* Session timeout
* Protected recruiter pages
* Protected job-seeker pages

Example JDBC query:

```java
PreparedStatement statement =
    connection.prepareStatement(
        "SELECT * FROM users WHERE email = ?"
    );

statement.setString(1, email);
```

---

# 🌐 Example Servlet URLs

Authentication:

```text
/login
/register
/logout
```

Jobs:

```text
/jobs
/job-details
/post-job
/update-job
/delete-job
```

Applications:

```text
/apply-job
/applications
/update-application
```

Resume:

```text
/upload-resume
/view-resume
/analyze-resume
```

> These are example mappings. Replace them with the actual servlet mappings defined in your `web.xml` or annotations.

---

# 🧪 Testing

Test the following major functionalities:

### Authentication

* Registration
* Login
* Logout
* Invalid credentials
* Session management

### Job Seeker

* Profile creation
* Resume upload
* Job search
* Job application
* Application tracking

### Recruiter

* Company profile
* Job creation
* Job editing
* Job deletion
* Applicant management

### AI

* Resume analysis
* Skill extraction
* Job matching
* Job recommendations

---

# 🚀 Future Enhancements

* AI-powered interview preparation
* AI-generated interview questions
* Automated interview scheduling
* Skill-gap analysis
* Personalized learning recommendations
* Email notifications
* Recruiter analytics
* Real-time messaging
* Advanced job recommendations
* Mobile application
* Multi-language resume processing

---

# 🤝 Contributing

Contributions are welcome.

### Clone the repository

```bash
git clone https://github.com/your-username/hiresense.git
```

### Create a branch

```bash
git checkout -b feature/new-feature
```

### Make your changes

```bash
git add .
```

### Commit

```bash
git commit -m "Add new feature"
```

### Push

```bash
git push origin feature/new-feature
```

Then create a Pull Request.

---

# 📄 License

This project is licensed under the **MIT License**.

---

# 👨‍💻 Project Information

| Category              | Technology                 |
| --------------------- | -------------------------- |
| Project               | HireSense                  |
| Type                  | Full-Stack Web Application |
| Language              | Java                       |
| Frontend              | JSP, HTML, CSS, JavaScript |
| Backend               | Java Servlets              |
| Architecture          | MVC                        |
| Database              | MySQL                      |
| Database Connectivity | JDBC                       |
| Server                | Apache Tomcat              |
| AI                    | AI / NLP                   |
| IDE                   | Eclipse / IntelliJ IDEA    |
| Version Control       | Git / GitHub               |

---

# ⭐ HireSense

**AI-Powered Job Portal**

> **Connecting Talent with Opportunity through Intelligent Technology.**

# SWE645hw3
<h1>GMU Summer 2022 SWE 645 - Component Based Architecture</h1>
<h2>Homework 3 - Dynamic SPA webpage: Maurice Joy & John DeCarlo
<ul>
<li>Angular Frontend</li>
<li>Java EE backend</li>
<li>AWS RDS MySQL db</li> 
<li>Kubernetes Survey Website</li>
</ul></h2>

We are building a home page with two links, one to a survey form for prospective students and their experience with the school, and the other to a list of survey results.

The project is broken in to two main folders, one for the frontend and anotehr for the backend.  The frontend is written in the latest version of Anugular as of July 2022.  The backend is written in Java 17 using the spring boot initializer as a maven project set up to compile to a .war file.  The database supporting this is an AWS RDS MySQL instance.

The frontend and backend will be containerized seperately and deployed to a Kubernetes Cluster on ASW EC2 Instance inside of AWS Learner Lab that is being managed by Rancher by a Rancher Cluster.

Front End URL: http://ec2-44-200-253-159.compute-1.amazonaws.com:31380/

Rancher/Kubernetes URL: http://3.236.134.186/dashboard/c/c-mgkh9/explorer/apps.deployment

Environmental variables were externalized and need to be passed when starting up containers.

Frontend Variables:
BACKEND_URL: ec2-44-200-253-159.compute-1.amazonaws.com
BACK_PORT: 32036

Backend Variables:
BACKEND_DB: jdbc:mysql://swe645-hw3.cscbzhkyuwx3.us-east-1.rds.amazonaws.com:3306/swe645hw3
DB_USER: swe645hw3
DP_PASSWORD: swe645hw3
BACKEND_PORT: 5000

Environmental Variables for frontend were populated using envsubst from the get-text package

Environmental Variables for backend were populated using springboot

Tools: 
    Frontend: Created using Angular, developed with VSCode
    Backend: Created using Springboot initializer with Maven and WebStarter, developed with Eclipse
    Other: Docker & Rancher
    Database information stored using AWS RDS, MySQL database
    Local testing done with docker-compose
    Collaboration done using GitHub, Zoom, Google Teams
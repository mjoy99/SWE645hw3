# SWE645hw3
<h1>GMU Summer 2022 SWE 645 - Component Based Architecture</h1>
<h2>Homework 3 - Dynamic SPA webpage:
<ul>
<li>Angular Frontend</li>
<li>Java EE backend</li>
<li>AWS RDS MySQL db</li> 
<li>Kubernetes Survey Website</li>
</ul></h2>

We are building a home page with two links, one to a survey form for prospective students and their experience with the school, and the other to a list of survey results.

The project is broken in to two main folders, one for the frontend and anotehr for the backend.  The frontend is written in the latest version of Anugular as of July 2022.  The backend is written in Java 17 using the spring boot initializer as a maven project set up to compile to a .war file.  The database supporting this is an AWS RDS MySQL instance.

The frontend and backend will be containerized seperately and deployed to a Kubernetes Cluster on ASW EC2 Instance inside of AWS Learner Lab that is being managed by Rancher by a Rancher Cluster.


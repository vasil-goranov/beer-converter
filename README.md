# beer-converter
## Telerik final project

A simple application to learn the basics of GitHub Actions and DevOps practices.
The application converts amount of beers to "real" alcohol via HTTP calls to four endpoints, passing the quantity of beers as PathVariable.

### ENDPOINTS:

- /toGin/{quantity}
- /toRakia/{quantity}
- /toWhiskey/{quantity}
- /toRum/{quantity}

example URl: http://localhost:7080/convertBeers/toRakia/15

The application returns plain text which is displayed directly in the browser - no html used.

### TECH STACK 

- Spring Boot
- Gradle
- GitHub Actions
- Docker

### MANUAL DEPLOYMENT ON LOCAL MACHINE

- Minikube
- Kubernetes 

### WORKFLOW DIAGRAM

![telerik-diagram](https://user-images.githubusercontent.com/25659072/150693843-21f26e35-337c-4c1b-b907-ed017faec529.png)

The workflow performs the following actions:

**_1. Checks:_**

- Runs the application's tests
- Checks the code with Lint
- Checks the code for exposed credentials or secrets
- Performs SonarCloud code quality check

**_2. Build and upload image_**

**_3. Publish image to Docker Hub_**

### USED MATERIALS AND RESOURCE:

- https://dev.to/stevenmcgown/kubernetes-for-dummies-5hmh - basic Kubernetes commands and principles
- https://kubernetes.io/docs/tasks/tools/install-kubectl-macos/ - installation of kubectl
- https://minikube.sigs.k8s.io/docs/start/ - minikube installation and basic commands
- https://medium.com/platformer-blog/lets-publish-a-docker-image-to-docker-hub-using-a-github-action-f0b17e5cceb3 publishing image to Docker Hub using GitHub Actions
- https://github.com/github/super-linter#environment-variables - GitHub Actions Linter documentation
- https://docs.docker.com/get-started/kube-deploy/ - deploying to Kubernetes

### FURTHER DEVELOPMENT RESEARCH RESOURCES:

- https://azure.github.io/kube-labs/1-github-actions.html#objective-of-the-lab - Azure Kubernetes
- https://www.youtube.com/watch?v=TMbXwNtuAJo - GitHub Actions and Kubernetes demo
- https://docs.docker.com/get-started/kube-deploy/ - deploy Docker images to Kubernetes
- https://docs.docker.com/cloud/aci-integration/ - deploy docker containers on Azure 

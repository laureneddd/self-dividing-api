# Java 
*Please do your work in this directory.*

## Challenge 
(Time limit: 30 mins)

Using your prefered IDE, **Work the following stories in the order they are displayed.**

---

### 1. User Story: Create a Java Spring Boot Application

**Title**: Set Up Java Spring Boot Application

**As a** developer,  
**I want** to create a Java Spring Boot application using Maven,  
**So that** I can start building and deploying an application under the "interview" directory.

---

#### **Acceptance Criteria**:

1. **Project Setup**:
   - Create a new Maven-based Spring Boot application under a folder named `interview`.
   - Ensure the application is set up in the java directory.

---

### 2. User Story: Self-Dividing Number Checker

**Title**: Determine if a Number is Self-Dividing

**As a** developer,  
**I want** to write a method that checks if a given integer is a self-dividing number,  
**So that** I can determine if a number is divisible by each of its non-zero digits.

---

#### **Acceptance Criteria**:
1. **Input**: A positive integer.
2. **Output**: A boolean value (True or False).
   - **True**: If the number is self-dividing.
   - **False**: If the number is not self-dividing or contains the digit zero.
3. The number must be divisible by every non-zero digit it contains.
4. The number must **not** contain the digit zero.

---

#### **Examples**:
   - Input: `128`, Output: `True`
   - Input: `102`, Output: `False`
   - Input: `127`, Output: `False`
   - Input: `7`, Output: `True`
   - Input: `24`, Output: `True`
   - Input: `17`, Output: `False`

---

### 3. User Story: Self-Dividing Number REST API

**Title**: Create REST API for Self-Dividing Number Check

**As a** developer,  
**I want** to create a REST API that takes a number as part of a GET request and returns whether the number is self-dividing,  
**So that** users can easily check if a number is self-dividing by making a simple HTTP request.

---

#### **Acceptance Criteria**:
1. **API Endpoint**:
   - Create a GET endpoint `/api/self-dividing/{number}`.
   - The endpoint should return a JSON response indicating whether the number is self-dividing.

---

### 4. User Story: Health Check Ping for API

**Title**: Perform Health Check Ping for API

**As a** developer,  
**I want** to implement a health check endpoint that returns the status of the API,  
**So that** I can monitor the availability and health of the API to ensure it's functioning correctly.

---

#### **Acceptance Criteria**:
1. **Health Check Endpoint**:
   - The endpoint should return a simple message indicating the application is healthy.

---

### 5. User Story: Commit and Push Changes
**Title**: Commit and Push Changes

**As a** developer,  
**I want** to commit my changes and push them to the remote repository,  
**So that** my work is saved and shared with the team.  

#### **Acceptance Criteria**:
1. **Commit Changes**:
    - Stage all changes for commit.
    - Write a meaningful commit message that describes the changes made.
    - Commit the changes to the local repository.
2. **Push Changes**:
    - Push the committed changes to the remote repository.
    - Verify that the changes are reflected in the remote repository.

---

### 6. User Story: Create Pull Request to Move Changes to Main

**Title**: Create Pull Request to Move Changes to Main

**As a** developer,  
**I want** to create a pull request to merge my feature branch changes into the main branch,  
**So that** my work is reviewed and integrated into the main codebase.

---

#### **Acceptance Criteria**:

1. **Create Pull Request**:
   - Navigate to the remote repository on the hosting service (e.g., GitHub).
   - Create a new pull request from the feature branch to the main branch.
   - Provide a clear title and description for the pull request.

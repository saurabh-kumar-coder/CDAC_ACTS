adding a new service using git :
--------------------------------
  - create a new branch for the new service --> checkout to the new branch --> create a new service in STS --> check status of newly added folder/ project if exists there or not using "git status" --> add the new service folder using "git add <service_folder_name>" --> commit the added service into the git repo using "git commit -m "<service_name> added to git"" --> after that push the service using "git push --set-upstream origin <branch_name>"

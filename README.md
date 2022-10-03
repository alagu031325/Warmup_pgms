# Warmup_pgms

Java 8 - Lambda expression usage

1. Arithmetic Operations using Lambda
2. Sorting List using Lambda




NOTE : Eclipse + Git
1. Clone the git repository in the local machine
2. Import the corresponding projects
3. Do changes and try to push and commit into existing repo
   [If https connection to github push is not working try ssh
   change Winodws->preferences->git[teams]->configuration
   -> repo config->origin url-> change to ssh] 
   
   https://stackoverflow.com/questions/68790276/pushing-from-eclipse-to-my-github-repository-via-https-stopped-working-git-rec
   
   For some reason https connection to github is not allowed ... 
   we can either generate personal access tokens and use it in 
   the place of the passowrd to authenticate the push or use ssh
   
4. In the underlying it needs ssh-keys to authenticate itself with github 
5. So if id_rsa doesnt exist in .ssh folder then generate one and add
   the public key to the github so that it can authenticate pushes from
   the local machine
   [account->settings->ssh keys->create new key with pub key contents]
6. Enter github credentials in eclipse as needed to connect to it
7. This helps in seamless integration of code from anywhere
8. Happy Learning:)

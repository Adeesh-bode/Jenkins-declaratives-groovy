def call(String url , String branch ){

  if (!url?.trim() || !branch?.trim()) {
        error "Both 'url' and 'branch' parameters must be provided!"
  }
  
  echo "Cloning ${url} on branch ${branch}"
  git branch: branch, url: url
  echo 'Clone github Project through git plugin & custom shared library call named clone.groovy'
  
}

def call(String url , String branch ){
  echo 'Hello Project - clone called'
  git branch: branch, url: branch
  echo 'Clone github Project through git plugin & custom shared library call named clone.groovy'
}

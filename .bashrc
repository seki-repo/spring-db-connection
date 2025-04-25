alias gc-='git checkout -'
alias gp='git push'
alias prj='cd D:project'
alias mainp='git checkout main && git pull'

function push() {
  branch = git branch --show-current
  git push -u origin $branch
}

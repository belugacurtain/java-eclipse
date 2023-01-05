- git bash 초기화

      git init

- git clone <github URL>

      github 저장소 만든 후 로컬 pc 폴더와 연결하는 구문

- git remote add origin <github URL>

      로컬 pc 폴더 만든 후 github 저장소에 연결하는 구문

- git add .

      git bash 로 로컬 디렉토리에 초점을 맞추고 그 안에 있는 모든 파일 및 폴더 형상관리 시작

- git commit -m "commit memo"

      github에 형상관리 할때 남기는 일종의 북마크 메세지

- git push -u origin |branch name|

      github에 형상관리 하고 싶은 것들 덮어쓰기
      ★주의사항 : github의 branch name 과 git bash에서 사용되고 있는 branch name 다르면 에러남
      ★★해결법
            git branch -m <기존 branch name> <변경할 branch name>

- git push -u origin |branch name| --force

      github에 형상관리 하고 싶은 것들 강제로 덮어쓰기

- git rm |file name|

      github에 형상관리 되고 있는 파일과 연결되어있는 로컬의 파일을 지우기
      ★주의사항 : 파일을 지운 후 commit 꼭 해주기

- git rm -rf |folder name|

      github에 형상관리 되고 있는 폴더와 연결되어있는 로컬의 폴더를 지우기
      ★주의사항 : 파일을 지운 후 commit 꼭 해주기
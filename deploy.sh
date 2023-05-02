REPOSITORY=/home/ubuntu/app
cd $REPOSITORY
mkdir shelltest

JAR_NAME = $(ls $REPOSITORY/build/libs/ | grep '.jar' | tail -n 1)
JAR_PATH = $REPOSITORY/build/libs/$JAR_NAME

CURRENT_PID = $(pgrep java)

if [ -z $CURRENT_PID ]
then
  echo ">Nothing working."
else
  sudo kill -9 $CURRENT_PID
fi

sudo nohup java -jar $JAR_PATH &

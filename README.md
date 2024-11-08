# java-ladder

# < controller >
## 1) Controller
* createParticipants() //참여자 생성기능
* createResults() //참여결과 생성기능
* createLadder() //사다리 생성기능
* createLadderResult() //사다리 결과 생성기능
* playLadderGame() //사다리 게임 실행기능

---
# < model >
## 1) DecideResult
* moveColumn() // 열부분 움직이는 기능
* moveRow() //행부분 움직이는 기능
* decideParticipantResult() //참여자 결과 결정기능
## 2) Ladder
## 3) LadderRow
* LadderRow() //사다리 열부분 생성기능
* chooseTrueOrFalse() //사다리 point 정하는 기능
## 4) Participant
* Participant() //참여자 생성, 참가자이름이 5글자 초과 시 에러발생 기능
* getCertainParticipantResult //특정 사용자의 결과를 반환하는 기능
## 5) Participants
## 6) Results
## 7) Splitter
* split() //문자열 자르는 기능

---
# < view >
## 1) InputView
* inputParticipants() //참여할 사람이름 입력기능
* inputResults() //결과 입력기능
* inputLadderHeight() //최대 사다리 높이 입력기능
* inputParticipantToWantResult() //결과를 보고싶은 사람 입력기능
## 2) OutputView
* outputParticipant() //참여자 출력기능
* outputLadderRow() //사다리행 출력기능
* outputLadder() //사다리 출력기능
* outputResults() //결과 출력기능
* outputAllParticipantsResult //모든 참여자 결과 출력기능
* outputCertainParticipantResult //특정 참여자 결과 출력기능
* outputParticipantResult //참여자 결과 출력기능

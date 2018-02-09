3.2 프로세스
# 프로세스 입장의 입출력
입출력 처리는 운영체제가 처리한다. (system call)

오래 걸려서 운영체제는 수행을 완료 한다.

입출력 하고 있는동안 다른일을 하지 못하면(다른 인스트럭션을 실행 못하면), 동기식 입출력

아니면 비동기식 입출력
# 동기십 입출려과 비동기식 입출력
## 동기식 입출력
* I/O 요청 후 입출력 작업이 완료된 후에야 제어가 사영자 프로그램에 넘어감
* 구현 방법
    * 1
        * I/O가 끝날 때까지 CPU를 낭비
        * 매시점 하나의 I/O 만 일어남
    * 2
        * I/O 가 완료될 때 까지 해당 프로그램에게서 CPU를 빼앗음
        * 다른 프로그램에게 CPU를 줌
## 비동기식 입출력
I/O 가 시작된 후 입출력 끝나는걸 기다리지 않고, 바로 사용자프로그램에게 제어권이 넘어감
# Thread
Thread 는 프로세스 내의 실행 단위

Thread 마다 Stack 주소 공간이 생긴다.

관리하기 위해 PCB 가 존재한다.

PCB 에는
* 레지스터
* PC
* memory limits
* list of open files
* pointer
* process state
등이 있다.

프로세스는 하나만 띄워놓고, data, code 영역은 공유한다.

PCB 의 레지스터와 PC를 여러개를 사용한다. (쓰레드가 data, code 의 어딜 사용하고 있나 저장함)

메모리 공간을 최대한 공유한다. (쓰레드 간의)

CPU 의 수행 관련 정보, Thread 의 Stack 은 별도로 가지고 있다.

CPU 의 수행 관련 정보는 register, PC 가 있다.

쓰레드는 CPU 의 실행 단위다.
## Thread 의 구성
* PC
* register set
* stack space
## Thread 가 동료 Thread 와 공유하는 부분(=task)
* code section
* data section
* OS resources
전통적인 개념의 heavyweight process 는 하나의 thread 를 가지고 있는 task 로 볼 수 있다.

프로세스를 여러개 두는 것보다 쓰레드를 여러개 두는게 더 관리가 쉽기 때문에 lightweight 라고 한다.
## 장점
* 하나의 프로세스 안에 쓰레드가 여러개면, 쓰레드가 blocked 상태일 때, 다른 쓰레드를 사용해서 러닝(Running)이 되어 빠른 처리를 할 수 있다.
* 동일한 일을 수행하는 다중 Thread 가 협력하여 높은 처리율 (throughtput) 과 성능 향상을 얻을 수 있다.
* 쓰레드를 사용하면 병렬성을 높일 수 있다.

프로세스를 여러개를 사용하면, 메모리 공간이 달라서 공유하는데 성능이 비효율적이다.

행렬을 곱한다고 할 때, CPU 가 여러개일 때, 각각 곱해서 합쳐줄 수 있다.

PCB 는 하나만 만들어진다. (프로세스 당 1개)

Thread 마다 PC, regster 가 여러개 생성된다.

PCB 는 쓰레드마다 독립적으로 필요한 데이터는 독립적으로 사용하는데, 나머지는 다 공유
# Benefits of Threads
* Responsiveness
    * 사용자 입장에서 응답이 빠르다. - 위에 blocked 로 설명, 웹으로 예를 들면, html 문서 읽고 이미지 불러오고 등등 하는데 이미지 불러올 동안에 blocked 가 된다. 비동기식으로 텍스트가 나옴
* Resource Sharing
    * n threads can share binary code, data, resource of the process
        * 메모리 영역 공유, 리소스 공유 (한 프로세스 니까)
* Economy (경제성)
    * createing & CPU switching thread
        * 쓰레드 생성은 오버헤드가 크지 않다.
        * context switch 가 일어날 때, 오버헤드가 큰데, 한 번만 이동하면 됨 (CPU 관련 정보 저장, cache memory flush  일어남)
        * 쓰레드 간에는 간단함
    * Solaris 의 경우 위 두 가지 overhead 가 각각 30 배, 5 배
        * 쓰레드 생성보다 프로세스 생성이 30배 높고
        * context switch 를 프로세스가 Thread 보다 5배 더 높다.
* Utilization of MP(MultiProcessor) Architectures
    * 프로세스가 하나지만 쓰레드가 여러개 있으면, 병렬적으로 일을 할 수 있다. (행렬 연산)
# Implementation of Threads
어떤 운영체제는 쓰레드를 운영체제가 지원한다. (커널 쓰레드)

운영체제가 쓰레드가 여러개인걸 알고 있다.
* Windows 95/98/NT
* Solaris
* Digital UNIX, Mach
어떤건 라이브러리가 지원한다. (유저 쓰레드(유저레벨))

프로세스 안에 쓰레드가 여러개인걸 운영체제는 모른다.
* POSIX Pthreads
* Mach C-threads
* Solaris threads

Some are real-time threads
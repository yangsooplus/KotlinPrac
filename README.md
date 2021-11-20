# KotlinPrac
 Inflearn [앱 8개를 만들면서 배우는 안드로이드 코틀린(Android Kotlin)](https://www.inflearn.com/course/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EC%BD%94%ED%8B%80%EB%A6%B0-%EB%AA%A8%EB%B0%94%EC%9D%BC%EC%95%B1) #3~#8

<br><br>
 
 # #3 랜덤 주사위 앱

<br>

![diceapp1](https://user-images.githubusercontent.com/69582122/136039420-aaaf9a09-7adf-4244-a5fb-10190184b6b3.png)   ![diceapp2](https://user-images.githubusercontent.com/69582122/136043052-3bc1b083-a8bc-48f2-84c8-d89841c695a2.png)


- DataBinding
- val과 var
- Random

<b>강의를 따라 만든 후, 오른쪽 화면처럼 총합이 표시되면 좋겠다고 생각하여 추가해봤다.</b>

<br><br><br><br>

# #4 속담 리스트

![sayinglist0](https://user-images.githubusercontent.com/69582122/140056013-54a3e306-f342-452b-ad23-02e4680986eb.png)![sayinglist1](https://user-images.githubusercontent.com/69582122/140056072-47b1f2be-29c6-45fd-b19f-d38a36722ebe.png)![sayinglist2](https://user-images.githubusercontent.com/69582122/140056114-d951132b-31fc-440e-bf4b-f521d6660bdd.png)![sayinglist3](https://user-images.githubusercontent.com/69582122/140332148-1871c820-b5a6-496b-b783-1964164423e9.png)

- DataBinding
- Adapter를 이용한 ListView
- MutableList
- DataClass

강의를 따라 앱 실행시 글귀 랜덤 출력과 리스트 페이지를 만들었다. 랜덤 주사위 앱에서 만들었던 것처럼 버튼을 누르면 랜덤으로 속담을 바꾸는 것을 추가해보았다. android:shadow 옵션을 이용하여 글자가 빛나는 것처럼 꾸며 보았다. 
버튼 디자인 변경을 위해 검색하다가 [Android Button Maker](https://angrytools.com/android/button/) 라는 사이트를 발견해서 알지 못했던 옵션을 간편히 조절할 수 있었다. 
(추가) data class를 이용해 속담과 그 뜻을 매치하였고, ListView의 item을 클릭하면 뜻이 토스트 메세지로 팝업되도록 추가하였다. 

<br><br><br><br>

# #5 전장 카드 리스트

![0](https://user-images.githubusercontent.com/69582122/140525363-9efb1d00-7036-4ee8-ae58-5b1206e1a759.png)![1](https://user-images.githubusercontent.com/69582122/140525300-7662cfd3-0849-4519-9d24-1f3995f82ac8.png)![2](https://user-images.githubusercontent.com/69582122/140525308-0d9e5be4-c6dd-4e4e-8d4c-ad3815dd4c09.png)![3](https://user-images.githubusercontent.com/69582122/140525314-0986f128-3695-4923-84af-63e7b52507a0.png)

- Navigation & Fragment
- RecyclerView

강의를 보면서 흐름에 따라 만들고 싶은 내용을 넣어서 만드는데, ListView보다 RecylclerView를 만드는데 코드가 복잡해서 Fragment 수를 늘리는 것 외에 기능을 추가하지 못했다. 변수명도 되도록이면 다르게 쓰려고 노력하는데, 변수가 무엇을 뜻하는지 파악하기 어려워서 뒤죽박죽이 되었다. 차분히 RecyclerView를 살펴봐야겠다. ~~다 넣기에는 너무 많아서 열받는 멀록과 재미없는 가시멧돼지는 뺐다.~~



<br><br><br><br>

# #6 나만의 한줄 일기장


![splash](https://user-images.githubusercontent.com/69582122/142726464-419adade-c8f6-4dfd-b0aa-9e826c6b02ea.png)![main](https://user-images.githubusercontent.com/69582122/142726467-760519db-bd2c-486b-bf7d-14beb615ba8a.png)![dialogue0](https://user-images.githubusercontent.com/69582122/142726470-e99b7c06-e50a-44a5-8e1a-a749357cd5fc.png)![dialogue1](https://user-images.githubusercontent.com/69582122/142726472-729d6733-fb22-4721-90bf-2a42b44077a5.png)![dialogue2](https://user-images.githubusercontent.com/69582122/142726475-f06180a1-224e-4e96-94bc-ff5ea55a7ee0.png)
![firebase](https://user-images.githubusercontent.com/69582122/142726480-e2d9bf58-d7cd-4f2c-8820-b0753ee9ed18.png)

- Firebase
    - auth
    - database
- Dialogue

파이어베이스의 익명 로그인, 이메일 로그인을 사용하는 방법을 익혔다. uid를 이용해 Realtime Database에 데이터를 읽고 쓰는 방법도 알게 되었다. 앞서 만들었던 스플래쉬화면, 어댑터를 이용한 리스트를 이용해서 앱을 구성했다. 
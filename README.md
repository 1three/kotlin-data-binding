# kotlin-data-binding
[Kotlin] `Data Binding` 공부하기

<br>

## 📄 Data Binding이란?
_**뷰와 데이터(모델)를 자동으로 연결**_ 해주는 안드로이드 앱 개발 기술입니다.

기존에는 findViewById로 뷰를 찾아와야 했지만,<br>
데이터 바인딩을 사용하면 **_XML 레이아웃 파일에서 뷰와 데이터를 바로 연결_** 할 수 있습니다.

이를 통해 코드 양을 줄이고 가독성과 유지 보수성을 향상시키고, 뷰와 데이터 간의 일관성을 유지하며,<br>
뷰에서 발생하는 이벤트나 사용자 입력을 자동으로 데이터에 반영할 수 있습니다.

<br>

#### 🔍 findViewById (기존 방식)

findViewById 메서드를 통해 뷰를 찾아와, 이벤트 처리합니다.

```Kotlin
val btn = findViewById<Button>(R.id.btnId)
btn.setOnClickListener {
    Toast.makeText(this, "Click!", Toast.LENGTH_LONG).show()
}
```

<br>

#### 📊 Data-Binding (_새로운_ 방식)

DataBindingUtil.setContentView 메서드를 통해 뷰를 찾아오지 않아도,<br>
레이아웃과 데이터 바인딩 객체를 _**자동으로**_ 연결할 수 있습니다.

```Kotlin
class MainActivity : AppCompatActivity() {

    // ActivityMainBinding 데이터 바인딩을 위해 자동으로 생성되는 클래스
    // activity_main.xml 파일에 정의된 모든 뷰와 바인딩된 속성들을 포함한다.
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // DataBindingUtil.setContentView() 메서드를 사용하여 액티비티에 데이터 바인딩을 설정
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // binding 객체를 통해 XML 레이아웃 파일에서 정의한 뷰에 접근
        binding.btnId.setOnClickListener {
            Toast.makeText(this, "Click!", Toast.LENGTH_LONG).show()
        }
    }
}
```

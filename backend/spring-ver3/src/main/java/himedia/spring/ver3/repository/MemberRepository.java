package himedia.spring.ver3.repository;

import himedia.spring.ver3.domain.Member; // 내가 정의한 Member
import java.util.List;
import java.util.Optional;

// 저장되는 패턴이 있음
public interface MemberRepository {

	// 메서드 반환이 뭐인지에 따라 달라짐
	// boolean save(Member member);
	// Long save(Member member); // ID
	
	// 반환형 메서드명(타입 매개변수);
	// 보통 찾을 때 find 많이 사용
	// 반환형 findId(Long id);
	// 근데 해당 Member 가 없을 수 있음(생성이 안됐거나 없거나) 그럴 땐 null 로 처리
	// 이것을 옵션(Optional)으로 만들어둠 -> null 을 안정적으로 처리
	// 그렇다고 무작정 Optional 쓰지 않기 (골치 아파짐)
	
	// 저장
	Member save(Member member); 
	
	// 검색
	Optional <Member> findById(Long id);
	Optional <Member> findByName(String name);
	List <Member> findAll();
	
}

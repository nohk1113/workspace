
import React, { useRef } from 'react'
import { useNavigate } from 'react-router-dom';

// content: 모달에서 보여지는 내용
// setIsShow:  모달을 닫는 코드
// onClickModalBtn  : 모달의 확인 버튼 클릭시 실행할 코드
const Modal = ({content, setIsShow, onClickModalBtn}) => {
  const navigate = useNavigate();
  const modalContainer = useRef();

  return (
    <div className='modal-container show' ref={modalContainer}>
      <div className='modal'>
        <div className='modal-header'>
          <span onClick={() => {
            modalContainer.current.className = 'modal-container';
            setTimeout(() => {
              setIsShow(false)
              onClickModalBtn();
            }, 300);
          }}>
            <i className="bi bi-x-lg"></i>
          </span>
        </div>
        <div className='modal-content'>
          {
            content()
          }
        </div>
        <div className='modal-footer'>
          <button type='button' className='btn btn-primary'
            onClick={() => {
              modalContainer.current.className = 'modal-container';
              setTimeout(() => {
                setIsShow(false)
                // 어떤 페이지에서 모달 창을 실행 했냐에 따라 실행 코드가 달라져야 함
                onClickModalBtn();
              }, 300);
            }}>확인</button>
        </div>
      </div>
    </div>
  )
}

export default Modal
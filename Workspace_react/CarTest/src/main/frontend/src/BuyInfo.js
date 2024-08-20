import React from 'react'

const BuyInfo = () => {
  return (
    <div className='buy-top'>
      <table className='buy-table'>
        <thead>
          <tr>
            <td>구매자 명</td>
            <td colSpan={3} ><input type='text' className='buy-input'/></td>
          </tr>
          <tr  className='buy-tr'>
            <td>색상</td>
            <td>
              <select>
                <option>흰색</option>
                <option>노란색</option>
                <option>검은색</option>
                <option>콜드블루</option>
              </select>
            </td>
            <td>모델</td>
            <td>
              <select>
                <option>아반떼</option>
                <option>쏘나타</option>
                <option>k3</option>
                <option>Qm6</option>
                <option>더 비틀</option>
                <option>e 클래스</option>
              </select>
            </td>
          </tr>
          <tr>
            <td>연락처</td>
            <td colSpan={3} ><input type='text' className='buy-input'/></td>
          </tr>
        </thead>
      </table>
      <button type='button' className='btn'>등록</button>
    </div>
  )
}

export default BuyInfo
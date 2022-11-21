import { type } from '@testing-library/user-event/dist/type'
import S from './styles.module.scss'

const Input = ({ value, type, label, placeholder }) => {
  return (
    <div className={S.container}>
      <input
        value={value}
        type={type}
        className={S.input}
        placeholder={placeholder}
      />
      <label className={S.label}>{label}</label>
    </div>
  )
}

export default Input

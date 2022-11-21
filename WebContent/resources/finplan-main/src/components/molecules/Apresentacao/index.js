import S from './styles.module.scss'

const Apresentacao = () => {
  return (
    <div className={S.container}>
      <p className={S.text}>Organizar suas finanças nunca foi tão simples!</p>
      <img src="./assets/pre-register-img.svg" />
      <p className={S.text}>
        Em apenas poucos passos, você iniciará uma jornada que te permitirá ter
        o controle da sua saúde financeira na palma de suas mãos. Vamos juntos
        nessa?
      </p>
    </div>
  )
}

export default Apresentacao

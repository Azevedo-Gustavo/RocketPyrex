import S from "./styles.module.scss";
import Button from "../../atoms/Button";
import { Link } from "react-router-dom";

const StartTemplate = () => {
  return (
    <div className={S.container}>
      <img src="assets/logo.svg" alt="Logo" className={S.logo} />
      <div className={S.btn_group}>
        <Link to="/pre-registro">
          <Button type="secondary">Abrir Conta</Button>
        </Link>
        <Link to="/home">
          <Button>Entrar</Button>
        </Link>
      </div>
    </div>
  );
};

export default StartTemplate;

import S from "./styles.module.scss";

import Card from "../../molecules/Card";
import Text from "../../atoms/Text";
import { Progress } from "antd";

import { format, utcToZonedTime } from "date-fns-tz";
import ptBR from "date-fns/locale/pt-BR/index";
import { Form } from "react-bootstrap";

const Menu = () => {
  const name = "Claire Fraser";
  const value = "2.809,79";
  // const mes = format(utcToZonedTime(new Date(), "America/Sao_Paulo"), "LLLL", {
  //   locale: ptBR,
  // });

  const descriptionFormat = (
    <div
      style={{
        width: "10rem",
      }}
    >
      <Text size={14} color={600}>
        Balanço mensal <br />
        <strong>R$ {value}</strong>
      </Text>
    </div>
  );

  return (
    <div
      className="d-flex flex-column align-items-center"
      style={{ gap: "4rem" }}
    >
      <div
        className="d-flex flex-column align-items-center"
        style={{ gap: "0.8rem" }}
      >
        <img src="assets/logo.svg" alt="Logo" className={S.logo} />
        <img src="assets/avatar2.svg" alt="Avatar" className={S.avatar} />
        <Text color={600}>
          {" "}
          Olá, <strong>{name}</strong>
        </Text>
      </div>
      <div className="d-flex align-items-center justify-content-between w-100">
        <div>
          <Progress
            type="dashboard"
            width={250}
            strokeWidth={4}
            strokeLinecap="round"
            strokeColor={{
              "0%": "#DE0049",
            }}
            format={() => null}
            trailColor="var(--neutral-400)"
            gapPosition="bottom"
            gapDegree={150}
            percent={60}
            className={S.grafico}
          />
        </div>
        <div className={S.graficoDescription}>{descriptionFormat}</div>
        <div
          className="d-flex flex-column align-items-center"
          style={{ gap: "1rem" }}
        >
          <Card type="receitas" value={10000} />
          <Card type="despesas" value={10000} />
        </div>
      </div>
    </div>
  );
};

export default Menu;

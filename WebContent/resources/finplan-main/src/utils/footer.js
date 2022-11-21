import Despesas from "../components/organisms/Despesas";
import Text from "../components/atoms/Text";
import Receitas from "../components/organisms/Receitas";
import Bancos from "../components/organisms/Bancos";

export const footer = {
  receitas: {
    title: <Text>Oba! Hora de lançar seus recebimentos</Text>,
    children: <Receitas />,
  },
  despesas: {
    title: <Text>Vamos registrar suas despesas?</Text>,
    children: <Despesas />,
  },
  bancos: {
    title: <Text>Agora inclua suas contas movimentadas</Text>,
    children: <Bancos />,
  },
  poupado: {
    title: <Text>Vamos registrar suas despesas?</Text>,
    children: <Despesas />,
  },
};
